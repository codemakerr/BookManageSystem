import { Component, OnInit } from '@angular/core';

import { book } from '../class/book';
import { ServiceService } from '../service.service';


@Component({
  selector: 'app-booklist',
  templateUrl: './booklist.component.html',
  styleUrls: ['./booklist.component.css']
})
export class BooklistComponent implements OnInit {

  dataSet: Array<book>;
  constructor(private net: ServiceService) { }

  ngOnInit() {
    this.net.getBook().subscribe(data => {
      this.dataSet = data;
    });
  }
  GetBookFromNet(name: string) {
    this.net.getBookByName(name).subscribe(data => {
      this.dataSet = data;
    });
  }
}
