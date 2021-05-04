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
    <div>
      <h1 className="text-primary py-3">Dashbord de vendas</h1>
      <div className="row px-3">
        <div className="col-sm-6">
          <h5>taxa de sucesso</h5>
          < Barchart / >
        </div>
          <div className="col-sm-6">
          <h5>taxa de sucesso</h5>
          < Donutchart / >
        </div>
      </div>
      < DataTable />
    </div>
    </div>
    < Footer />
    </>
  );
}

export default App;
