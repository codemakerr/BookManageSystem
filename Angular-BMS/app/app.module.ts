import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http'


import { AppComponent } from './app.component';
import { TitleComponent } from './title/title.component';
import { NavbarComponent } from './navbar/navbar.component';
import { BookOperateComponent } from './book-operate/book-operate.component';
import { BooklistComponent } from './booklist/booklist.component';
import { ServiceService } from './service.service';


@NgModule({
  declarations: [
    AppComponent,
    TitleComponent,
    NavbarComponent,
    BookOperateComponent,
    BooklistComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule
  ],
  providers: [ServiceService],
  bootstrap: [AppComponent]
})
export class AppModule { }
