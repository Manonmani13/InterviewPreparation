import React, { useState, useEffect } from 'react';
import { TextField, Container, Paper, Button } from '@mui/material';

export default function Student() {
  const [name, setName] = useState('');
  const [address, setAddress] = useState('');
  const [students, setStudents] = useState([]);

  const handleClick = (e) => {
    e.preventDefault();
    const student = { name, address };

    fetch("http://localhost:8080/student/add", {
      method: "POST",
      headers: { "Content-Type": "application/json" },
      body: JSON.stringify(student),
    })
    .then((response) => response.text())  // Change to text() if response is not JSON
    .then((data) => {
      console.log("Response from server:", data);
      setName('');
      setAddress('');
    })
    .catch((error) => {
      console.error('Fetch error:', error);
    });
  };

  useEffect(() => {
    fetch("http://localhost:8080/student/getAll")
      .then((res) => {
        if (!res.ok) {
          throw new Error(`HTTP error! status: ${res.status}`);
        }
        return res.json();
      })
      .then((result) => {
        setStudents(result);
      })
      .catch((error) => {
        console.error('Fetch error:', error);
      });
  }, []);

  return (
    <Container>
      <Paper elevation={3} style={{ padding: '50px 20px', width: 600, margin: '20px auto' }}>
        <h1 style={{ color: "blue" }}><u>Add Student</u></h1>
        <form noValidate autoComplete="off">
          <TextField
            id="outlined-basic"
            label="Student Name"
            variant="outlined"
            fullWidth
            value={name}
            onChange={(e) => setName(e.target.value)}
          />
          <TextField
            id="outlined-basic"
            label="Student Address"
            variant="outlined"
            fullWidth
            value={address}
            onChange={(e) => setAddress(e.target.value)}
          />
          <Button variant="contained" color="secondary" onClick={handleClick}>
            Submit
          </Button>
        </form>
      </Paper>
      <h1>Students</h1>
      <Paper elevation={3} style={{ padding: '50px 20px', width: 600, margin: '20px auto' }}>
        {students.map((student) => (
          <Paper elevation={6} style={{ margin: "10px", padding: "15px", textAlign: "left" }} key={student.id}>
            Id: {student.id}<br />
            Name: {student.name}<br />
            Address: {student.address}
          </Paper>
        ))}
      </Paper>
    </Container>
  );
}
