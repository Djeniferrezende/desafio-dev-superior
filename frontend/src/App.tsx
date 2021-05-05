import Barchart from 'components/Barchart';
import DataTable from 'components/DataTable';
import Donutchart from 'components/Donutchart';
import Footer from 'components/Footer';
import NavBar from 'components/NavBar';
import React from 'react';

function App() {
  return (
    <>
     <NavBar />
     <div className="container">
      <h1 className="text-primary py-3">Dashbord de vendas</h1>
      <div className="row px-3">
        <div className="col-sm-6">
          <h5 className="text-secondary">Taxa de sucesso</h5>
          < Barchart / >
        </div>
        <div className="col-sm-1"></div>
          <div className="col-sm-5">
          <h5  className="text-width-2 text-secondary">Todas as Vendas</h5>
          < Donutchart / >
        </div>
      </div>
      <div className="py-3">
        <h2 className="text-primary">Todas Vendas</h2>
      < DataTable />
</div>
    </div>
    < Footer />
    </>
  );
}

export default App;
