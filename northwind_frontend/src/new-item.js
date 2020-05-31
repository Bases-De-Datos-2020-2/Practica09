import React, { Component } from 'react';
import './App.css';

class NewItem extends Component {

  constructor(props) {
    super(props);
    this.onCancel = this.onCancel.bind(this);
    this.onSubmit = this.onSubmit.bind(this);
    this.handleInputChange = this.handleInputChange.bind(this);
    this.state = {
      nombreCompania: '',
      nombreContacto: '',
      cargoContacto: '',
      telefono: '',
      fax: '',
      paginaProvedor: '',
      idRegion: '',
      creadoPor: ''

    };
  }

  handleInputChange(event) {
    const target = event.target;
    const value = target.value;
    const name = target.name;
    this.setState({
      [name]: value
    });
  }

  onCancel() {
    this.props.onCancel();
  }

  onSubmit() {
        this.props.onSubmit(this.state);
  }

  render() {
    return (
      <div className="input-panel">
      <span className="form-caption">Nuevo Provedor:</span>
      <div>
        <label className="field-name">Nombre Compania:<br/>
          <input value={this.state.nombreCompania} name="nombreCompania" maxLength="40"  onChange={this.handleInputChange} placeholder="nombre compania" />
        </label>
      </div>
      <div>
        <label className="field-name">Nombre Contacto:<br/>
          <input value={this.state.nombreContacto} name="nombreContacto" maxLength="40"  onChange={this.handleInputChange} placeholder="nombre contacto" />
        </label>
      </div>
      <div>
        <label className="field-name">Cargo Contacto:<br/>
          <input value={this.state.cargoContacto} name="cargoContacto" maxLength="40"  onChange={this.handleInputChange} placeholder="cargo contacto" />
        </label>
      </div>
      <div>
        <label className="field-name">Telefono:<br/>
          <input value={this.state.telefono} name="telefono" maxLength="40"  onChange={this.handleInputChange} placeholder="telefono" />
        </label>
      </div>
      <div>
        <label className="field-name">Fax:<br/>
          <input value={this.state.fax} name="fax" maxLength="40"  onChange={this.handleInputChange} placeholder="fax" />
        </label>
      </div>
      <div>
        <label className="field-name">Página Provedor:<br/>
          <input value={this.state.paginaProvedor} name="paginaProvedor" maxLength="40"  onChange={this.handleInputChange} placeholder="pagina provedor" />
        </label>
      </div>
      <div>
        <label className="field-name">Id Region:<br/>
          <input value={this.state.idRegion} name="idRegion" maxLength="40"  onChange={this.handleInputChange} placeholder="id region" />
        </label>
      </div>
      <div>
        <label className="field-name">Creado Por:<br/>
          <input value={this.state.creadoPor} name="creadoPor" maxLength="40"  onChange={this.handleInputChange} placeholder="creado por" />
        </label>
      </div>
      <br/>
      <button onClick={() => this.onCancel()}>Cancel</button>
      <button onClick={() => this.onSubmit()}>Create</button>
      </div>
    );
  }
}
export default NewItem;
