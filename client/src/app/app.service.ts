import { ResourceMethod } from 'ng2-resource-rest';
import { ResourceAction } from 'ng2-resource-rest';
import { ResourceActionBase } from 'ng2-resource-rest';
import { Resource } from 'ng2-resource-rest';
import { ResourceParams } from 'ng2-resource-rest';
import { Injectable } from "@angular/core";
import { RequestMethod, Request } from "@angular/http";

@Injectable()
export class AppService extends Resource {
 

  @ResourceAction({
    method: RequestMethod.Put
  })
  update: ResourceMethod<{files: File[]}, any>
}
