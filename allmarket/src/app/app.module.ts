import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

// for http service
import { HttpClientModule } from '@angular/common/http';

import { AppComponent } from './app.component';
import { SearchBarComponent } from './search-bar/search-bar.component';
import { HeaderComponent } from './header/header.component';
import { ItemDetailComponent } from './item-detail/item-detail.component';
import { AppRoutingModule } from './app-routing.module';

@NgModule({
	declarations: [
		AppComponent,
		SearchBarComponent,
		HeaderComponent,
		ItemDetailComponent
	],
	imports: [
		BrowserModule,
		HttpClientModule,
		AppRoutingModule,
	],
	providers: [],
	bootstrap: [AppComponent]
})
export class AppModule { }
