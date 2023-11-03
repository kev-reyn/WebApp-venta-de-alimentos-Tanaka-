import { Component, OnInit } from '@angular/core';
import { PlatilloService } from '../platillo.service';

@Component({
  selector: 'app-inicio',
  templateUrl: './inicio.component.html',
  styleUrls: ['./inicio.component.css']
})
export class InicioComponent implements OnInit{
  title = 'Restaurante Tanaka';

  platillos: any[] = [];
  
  constructor(private platilloService: PlatilloService) { }
  
  ngOnInit(): void {
    this.platilloService.GetAllPlatillos().subscribe((data) => {
      this.platillos = data;
    });
  }
}
