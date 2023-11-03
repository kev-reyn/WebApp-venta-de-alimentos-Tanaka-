import { Component } from '@angular/core';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {
  username: string = '';
  password: string = '';

  onSubmit() {
    // Aquí va la lógica de autenticación o redirección a otra página
    // Por ahora, solo mostraremos un mensaje de éxito en la consola.
    console.log('Login successful', this.username, this.password);
  }
}
