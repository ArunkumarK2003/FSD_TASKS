import { TestBed } from '@angular/core/testing';

import { AngulService } from './angul.service';

describe('AngulService', () => {
  let service: AngulService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(AngulService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
