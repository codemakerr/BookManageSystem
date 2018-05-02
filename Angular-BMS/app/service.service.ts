import { Injectable } from '@angular/core';
import { book } from './class/book';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs/Observable';


@Injectable()
export class ServiceService {

  constructor(private http: HttpClient) { }


  getBook(): Observable<any> {
    return this.http.get<book[]>('//localhost:8080/GetAllBook');
  }

  getBookByName(name: string): Observable<any> {
    return this.http.get<book[]>('//localhost:8080/GetBookByName?name=' + name);
  }
}
