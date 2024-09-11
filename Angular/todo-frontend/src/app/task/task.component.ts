import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { TaskService } from './task.service';
import { Task } from './task.model';
import { RouterOutlet } from '@angular/router';
import {FormsModule} from '@angular/forms'

@Component({
  selector: 'app-task',
  standalone: true,
  imports: [CommonModule,RouterOutlet,TaskComponent,FormsModule],
  templateUrl: './task.component.html',
  styleUrl: './task.component.css'
})
export class TaskComponent {
  newTask: Task = { description: "", completed: false };

  constructor(private taskService: TaskService) {}

  createTask(): void {
    this.taskService.createTask(this.newTask).subscribe((createdTask: Task) => {
      this.newTask = { description: "", completed: false };
    });
  }
}