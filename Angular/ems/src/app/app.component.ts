import { Component } from '@angular/core';
import { Employee } from './model/Employee';
import { EmployeeService } from './employee.service';
import { subscribe } from 'node:diagnostics_channel';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  employee:Employee;
  service:any;
result:string;
employeArr:Employee[];
flag:boolean;
url:string;
  
  constructor(private employeeService:EmployeeService)
  {
    this.url="http://localhost:3004/employees";
    this.employee=new Employee();
    this.result="";
    this.flag=false;e
    this.employeArr=[];
  }

insertEmployee(data:any){
  //this.http.post<Employee>(this.url,Employee).subscribe();
this.employee.empId=data.empId;
this.employee.empName=data.empName;
this.employee.empSalary=data.empSalary;
this.result=this.service.insertEmployee(this.employee);
}
}