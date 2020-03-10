import { Component } from '@angular/core';

import { Router, ActivatedRoute, ParamMap } from '@angular/router';

@Component({
	selector: 'app-root',
	templateUrl: './app.component.html',
	styleUrls: ['./app.component.css']
})
export class AppComponent {
	title = 'allmarket';

	constructor(
		private router: Router
	) {

	}

	onSearch(term: string): void {

		console.log("on search xd term: " + term);

		this.router.navigate(['item', term]);

	}

}
