/*
	employee get from service  backend api call
*/

import { Injectable} from '@angular/Core';
import { HttpClient, HttpHeaders} from '@angular/common/http';
import {Observable, BehaviorSubject } from 'rxjs';



export class EmployeeService {


@Injectable({
	provideIn: 'root'
})

@Component({
	seelctor: 'app-employee',
})

public getEmployee(EmployeeDto: emp): Observable<EmployeeDto>{

	/*  if any headers applicable
	let headers =new HttpHeaders({
	
	}
	*/
	
	return this.httpClient.get('http://localhost:8080/demo/employee/{id}', options).pipe(
		
	);

}

}

