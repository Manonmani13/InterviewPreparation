import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import {Task} from './task.model';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class TaskService {

  private  url="http://localhost:8080/api/task"
  constructor(private httpClient :HttpClient) { }
  createTask(newTask:Task):Observable<Task>
  {
return this.httpClient.post<Task>(this.url,newTask);
  }
  getTask(newTask:Task):Observable<Task[]>
  {
return this.httpClient.get<Task[] >(this.url);
  }
}
