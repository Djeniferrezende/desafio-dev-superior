import React from 'react';
import Chart from 'react-apexcharts'

function Donutchart() {
 const mockData = {
    series: [477138, 499928, 444867, 220426, 473088],
    labels: ['Anakin', 'Barry Allen', 'Kal-El', 'Logan', 'Padmé']
}

const options = {
    legend: {
        show: true
    }
}
  return (
      <Chart options ={{...options, labels:mockData.labels}}
      series ={mockData.series}
      type="donut"
      heigth="240"
      />


  );
}

export default Donutchart;
