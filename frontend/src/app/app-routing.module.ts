import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LoginFormComponent } from './login-form/login-form.component';
import { NotFoundComponent } from './not-found/not-found.component';
import { HomeComponent } from './home/home.component';
import { RouteGuardService } from './service/route-guard.service';


const routes: Routes = [

{path:'',component:LoginFormComponent},
{path:'home',component:HomeComponent,canActivate:[RouteGuardService]},
{path:'*',component:NotFoundComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {}
