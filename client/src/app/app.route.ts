import { AppComponent } from './app.component';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

export const AppRoute: Routes = [{ path: 'import-client', component: AppComponent }];
@NgModule({
  imports: [
    RouterModule.forChild(AppRoute)
  ],
  exports: [RouterModule]
})
export class AppRoutingModule {

}