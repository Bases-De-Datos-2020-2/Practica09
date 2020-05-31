import React, { Component } from 'react';

import './App.css';
class ItemDetails extends Component {
  constructor(props) {
    super(props);
    this.onEdit = this.onEdit.bind(this);
    this.onDelete = this.onDelete.bind(this);
  }

  render() {
    const item = this.props.item;
    return (
      <div className="input-panel">
      <span className="form-caption">{ item.name}</span>
      <div><span className="field-name">Nombre Compania:</span><br/> {item.nombreCompania}</div>
      <div><span className="field-name">Nombre Contacto:</span><br/> {item.nombreContacto}</div>
      <div><span className="field-name">Cargo Contacto:</span><br/> {item.cargoContacto}</div>
      <div><span className="field-name">Telefono:</span><br/> {item.telefono}</div>
      <div><span className="field-name">Fax:</span><br/> {item.fax}</div>
      <div><span className="field-name">Página Provedor:</span><br/> {item.paginaProvedor}</div>
      <div><span className="field-name">Id Region:</span><br/> {item.idRegion}</div>
      <div><span className="field-name">Fax:</span><br/> {item.fax}</div>
      <div><span className="field-name">Creado:</span><br/> {item.creado}</div>
      <div><span className="field-name">Creado Por:</span><br/> {item.creadoPor}</div>
      <br/>
      <button onClick={() => this.onDelete()}>Delete</button>
      <button onClick={() => this.onEdit()}>Edit</button>
      </div>
    );
  }

  onEdit() {
    this.props.onEdit();
  }

  onDelete() {
    const item = this.props.item;
    if(window.confirm("Are you sure to delete item: " + item.nombreCompania + " ?")) {
      this.props.onDelete(item.idProvedor);
    }
  }

}

export default ItemDetails;
