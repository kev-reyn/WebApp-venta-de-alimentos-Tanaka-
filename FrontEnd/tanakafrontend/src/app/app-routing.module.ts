import { NgModule } from "@angular/core";
import { RouterModule, Routes } from "@angular/router";
import { InicioComponent } from "./inicio/inicio.component";
import { RecomendacionesComponent } from "./recomendaciones/recomendaciones.component";
import { LoginComponent } from "./login/login.component";

const routes: Routes = [
    { path: 'Inicio', component: InicioComponent },
    { path: 'recomendaciones', component: RecomendacionesComponent},
    { path: 'login', component: LoginComponent},
    { path: '', redirectTo: '/inicio', pathMatch: 'full' },
    
]

@NgModule({
    imports: [RouterModule.forRoot(routes)],
    exports: [RouterModule],
})

export class AppRoutingModule {

}