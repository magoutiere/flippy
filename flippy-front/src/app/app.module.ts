import {NgModule} from '@angular/core';
import {BrowserModule} from '@angular/platform-browser';

import {AppComponent} from './app.component';
import {fr_FR, NZ_I18N} from 'ng-zorro-antd/i18n';
import {registerLocaleData} from '@angular/common';
import fr from '@angular/common/locales/fr';
import {FormsModule} from '@angular/forms';
import {HttpClientModule} from '@angular/common/http';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import {FlipListComponent} from './components/flip-list/flip-list.component';
import {NzListModule} from "ng-zorro-antd/list";
import {NzSwitchModule} from "ng-zorro-antd/switch";

registerLocaleData(fr);

@NgModule({
  declarations: [
    AppComponent,
    FlipListComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule,
    BrowserAnimationsModule,
    NzListModule,
    NzSwitchModule
  ],
  providers: [{provide: NZ_I18N, useValue: fr_FR}],
  bootstrap: [AppComponent]
})
export class AppModule {
}
