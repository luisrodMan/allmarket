import { Component, OnInit } from '@angular/core';

import { ActivatedRoute } from '@angular/router';
import { Location } from '@angular/common';

import { Item, ItemDetail } from '../item';
import { ItemService } from '../item.service';


@Component({
	selector: 'app-item-detail',
	templateUrl: './item-detail.component.html',
	styleUrls: ['./item-detail.component.css']
})
export class ItemDetailComponent implements OnInit {

	detail: ItemDetail;

	constructor(
		private route: ActivatedRoute,
		private location: Location,
		private itemService: ItemService
	) { }

	ngOnInit(): void {
		this.getItemDetail();
	}

	getItemDetail(): void {
		const sku: string = this.route.snapshot.paramMap.get('sku');
		this.itemService.getItemDetail(sku).subscribe(item => this.detail = item);
	}

	goBack(): void {
		this.location.back();
	}

}
