import { Component, OnInit } from '@angular/core';

import { ItemService } from  '../item.service';

@Component({
	selector: 'app-search-bar',
	templateUrl: './search-bar.component.html',
	styleUrls: ['./search-bar.component.css']
})
export class SearchBarComponent implements OnInit {

	//item: ItemDetail;

	constructor(
		private itemService: ItemService
	) { }

	ngOnInit(): void {
	}

	onSearch(term: string) {
		//getItem();
	}

}
