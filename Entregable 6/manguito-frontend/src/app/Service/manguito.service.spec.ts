import { TestBed } from '@angular/core/testing';

import { ManguitoService } from './manguito.service';

describe('EmprendimientoService', () => {
  let service: ManguitoService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ManguitoService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
