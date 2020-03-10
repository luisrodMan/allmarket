import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ItemDetailComponent } from './item-detail/item-detail.component';
import { HeaderComponent } from './header/header.component';

const routes: Routes = [
	{ path: '', redirectTo: '/header', pathMatch: 'full' },
	{ path: 'header', component: HeaderComponent },
	{ path: 'item/:sku', component: ItemDetailComponent }
];

@NgModule({
	declarations: [],
	imports: [
		RouterModule.forRoot(routes)
	],
	exports: [RouterModule]
})
export class AppRoutingModule { }
