import { User } from './user';
import { HttpClient} from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

import { environment } from 'src/environments/environment';

@Injectable({providedIn: 'root'})
export class SingupService {

  private apiServerUrl = environment.apiBaseUrl;
 

  constructor(private httpClient: HttpClient){}
  
  public getUsers(): Observable<User[]> {
    return this.httpClient.get<User[]>(`${this.apiServerUrl}/user/all`);
  }
  public addUser(user: User): Observable<User> {
    return this.httpClient.post<User>(`${this.apiServerUrl}/user/add`, user);
  }

 

  registerUser(user:User)
  {
    console.log(user);
    return this.httpClient.post(`baseUrl`,user);
  }
}
