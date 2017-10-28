import { AppService } from './app.service';
import { Component, ElementRef, Renderer, ViewChild, OnInit } from '@angular/core';
import { Message } from "primeng/components/common/api";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent implements OnInit {
  msgs: Message[] = [];
  files: File[] = [];
constructor(private appService: AppService) {
  }
  ngOnInit() {

  }

  update(){
    this.appService.update({files: this.files}).subscribe(data => {
      this.msgs.push({
        severity: 'success',
        summary: 'Mensagem de sucesso',
        detail: 'Operação realizada com sucesso!'
      });
    });
  }
}