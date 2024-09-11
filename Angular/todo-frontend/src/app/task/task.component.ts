import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { TaskService } from './task.service';
import { Task } from './task.model';
import { RouterOutlet } from '@angular/router';

@Component({
  selector: 'app-task',
  standalone: true,
  imports: [CommonModule,RouterOutlet,TaskComponent],
  templateUrl: './task.component.html',
  styleUrl: './task.component.css'
})
export class TaskComponent {

  constructor(private taskService:TaskService)
  {
    newTask:Task={description:"",completed:false};
    createTask():void{
      this.taskService.createTask(this.taskService).subscribe((createTask)=>
    {
      this.newTask={description:"",completed:false};

    })

    }
  }
}
