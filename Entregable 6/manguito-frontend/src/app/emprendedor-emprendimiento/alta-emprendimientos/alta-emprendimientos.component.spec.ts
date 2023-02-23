import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AltaEmprendimientosComponent } from './alta-emprendimientos.component';

describe('AltaEmprendimientosComponent', () => {
  let component: AltaEmprendimientosComponent;
  let fixture: ComponentFixture<AltaEmprendimientosComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AltaEmprendimientosComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AltaEmprendimientosComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
