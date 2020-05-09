import { Component, OnInit } from '@angular/core';
import { Router, ActivatedRoute } from '@angular/router';
import { fixUrl, hi } from '../model/constants';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

name;
url = `${fixUrl}${hi}`;
  
constructor(private http:HttpClient) { }

  ngOnInit(): void {

    this.http.get(this.url).subscribe(data => this.name = data);

  }

}
