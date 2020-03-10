import { Component, OnInit } from '@angular/core';

import { Item } from '../item';
import { ItemData } from '../item-data';

@Component({
	selector: 'app-item-view',
	templateUrl: './item-view.component.html',
	styleUrls: ['./item-view.component.css']
})
export class ItemViewComponent implements OnInit {

	data: ItemData = {
		item: {
			sku: "000000001",
			description: "Apple iPhone 8 GSM desbloqueado, 64GB - espacio gris (restaurado)",
			mark: "samsung",
		},
	};

	constructor() { }

	ngOnInit(): void {
	}

}
