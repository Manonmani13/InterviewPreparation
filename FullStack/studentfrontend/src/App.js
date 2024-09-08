import React from 'react';
import './App.css';
import Appbar from './component/Appbar';  // Ensure this matches the component's name
import Student from './component/Student'

function App() {
  return (
    <div className="App">
      <Appbar />
      <Student/>
    </div>
  );
}

export default App;
