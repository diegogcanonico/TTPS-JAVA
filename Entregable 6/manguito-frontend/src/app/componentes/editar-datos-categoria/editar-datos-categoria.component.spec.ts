import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EditarDatosCategoriaComponent } from './editar-datos-categoria.component';

describe('EditarDatosCategoriaComponent', () => {
  let component: EditarDatosCategoriaComponent;
  let fixture: ComponentFixture<EditarDatosCategoriaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ EditarDatosCategoriaComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(EditarDatosCategoriaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
