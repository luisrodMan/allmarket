import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { SearchBarComponent } from './search-bar/search-bar.component';
import { HeaderComponent } from './header/header.component';
import { ItemViewComponent } from './item-view/item-view.component';

@NgModule({
	declarations: [
		AppComponent,
		SearchBarComponent,
		HeaderComponent,
		ItemViewComponent
	],
	imports: [
		BrowserModule
	],
	providers: [],
	bootstrap: [AppComponent]
})
export class AppModule { }
