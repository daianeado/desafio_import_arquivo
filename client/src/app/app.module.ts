import { AppRoute } from './app.route';
import { HashLocationStrategy, LocationStrategy } from '@angular/common';
import { CUSTOM_ELEMENTS_SCHEMA, NgModule, LOCALE_ID } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { RouterModule } from '@angular/router';
import { ResourceModule } from 'ngx-resource';
import { ToastrModule } from 'ngx-toastr';
import { ConfirmationService, GrowlModule } from 'primeng/primeng';
import { BlockUIModule } from 'ng-block-ui';

import { AppComponent } from './app.component';
import { PrimeNgModules } from './primeng.modules';

@NgModule({
  declarations: [
    AppComponent,
  ],
  imports: [
    BlockUIModule,
    BrowserAnimationsModule,
    BrowserModule,
    FormsModule,
    GrowlModule,
    PrimeNgModules,
    ReactiveFormsModule,
    ToastrModule.forRoot(),
    ResourceModule.forRoot(),
    RouterModule.forRoot(AppRoute, { useHash: true })

  ],
  providers: [
    ConfirmationService,
    { provide: LocationStrategy, useClass: HashLocationStrategy },
    { provide: LOCALE_ID, useValue: 'pt-BR' }
  ],
  schemas: [
    CUSTOM_ELEMENTS_SCHEMA
  ],
  bootstrap: [AppComponent],
})
export class AppModule { }
