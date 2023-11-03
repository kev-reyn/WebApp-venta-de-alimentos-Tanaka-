import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class PlatilloService {

  private baseUrl = 'http://localhost:8080';

  constructor(private http: HttpClient){}

  GetAllPlatillos(){
    return this.http.get<any[]>(`${this.baseUrl}/api/platillos`);
  }
}
