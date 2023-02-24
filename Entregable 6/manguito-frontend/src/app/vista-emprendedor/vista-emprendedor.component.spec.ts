import { ComponentFixture, TestBed } from '@angular/core/testing';

import { VistaEmprendedorComponent } from './vista-emprendedor.component';

describe('VistaEmprendedorComponent', () => {
  let component: VistaEmprendedorComponent;
  let fixture: ComponentFixture<VistaEmprendedorComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ VistaEmprendedorComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(VistaEmprendedorComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
