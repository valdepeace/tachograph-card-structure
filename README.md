# tachograph-card-structure


Estructura basada en el REGLAMENTO (CE) No 1360/2002 DE LA COMISIÓN de 13 de junio de 2002.



<table>
  <caption>Tabla de bloques de memoria</caption>
  <tr>
    <th rowspan="2">FID</th>
    <th colspan="4">Tarjeta</th>
    <th rowspan="2">Archivo</th>
    <th rowspan="2">Clase java</th>
    <th>Observaciones</th>
  </tr>
  <tr>
    <th>Conductor</th>
    <th>Ensayo</th>
    <th>Control</th>
    <th>Empresa</th>
  </tr>
  <tr>
    <td>0002</td> <td>X</td> <td>X</td> <td>X</td> <td>X</td> <td>ICC</td> <td>CardIccIdentification</td>
  </tr>
  <tr>
    <td>0005</td> <td>X</td> <td>X</td> <td>X</td> <td>X</td> <td>IC</td> <td>CardChipApplicationIdentification</td>
  </tr>
  <tr>
    <td>0501</td> <td>X</td> <td>X</td> <td>X</td> <td>X</td> <td>Aplication_Identification</td> <td>DriverCardApplicationIdentification</td>
  </tr>
  <tr>
    <td>c100</td> <td>X</td> <td>X</td> <td>X</td> <td>X</td> <td>Card_Certificate/td> <td>CardCertificate</td>
  </tr>
  <tr>
    <td>c108</td> <td>X</td> <td>X</td> <td>X</td> <td>X</td> <td>CA_Certificate</td> <td>MemberStateCertificate</td>
  </tr>
  <tr>
    <td>0502</td> <td>X</td> <td>X</td> <td></td> <td></td> <td>Events_Data</td> <td>CardEventData</td>
  </tr>
  <tr>
    <td>0503</td> <td>X</td> <td>X</td> <td></td> <td></td> <td>Faults_Data</td> <td>CardEventData</td>
  </tr>
  <tr>
    <td>0504</td> <td>X</td> <td>X</td> <td></td> <td></td> <td>Driver_Activity_Data</td> <td>CardDriverActivity</td>
  </tr>
  <tr>
    <td>0505</td> <td>X</td> <td>X</td> <td></td> <td></td> <td>Vehicles_Used</td> <td>CardVehiclesUsed</td>
  </tr>
  <tr>
    <td>0506</td> <td>X</td> <td>X</td> <td></td> <td></td> <td>Places</td> <td>CardPlaceDailyWorkPeriod</td>
  </tr>
  <tr>
    <td>0507</td> <td>X</td> <td>X</td> <td></td> <td></td> <td>Current_Usage</td> <td>CardCurrentUse</td>
  </tr>
  <tr>
    <td>0508</td> <td>X</td> <td>X</td> <td></td> <td></td> <td>Control_Activity_Data</td> <td>CardControlActivityDataRecord</td>
  </tr>
  <tr>
    <td>0509</td> <td></td> <td>X</td> <td></td> <td></td> <td>Card_Download</td> <td>NoOfCalibrationsSinceDownload</td><td>sin desarrollar</td>
  </tr>
  <tr>
    <td>050a</td> <td></td> <td>X</td> <td></td> <td></td> <td>Calibration</td> <td>WorkshopCardCalibrationData</td><td>sin desarrollar</td>
  </tr>
  <tr>
    <td>050b</td> <td></td> <td>X</td> <td></td> <td></td> <td>Sensor_Installation_data</td> <td>SensorInstallationSecData</td><td>sin desarrollar</td>
  </tr>  
  <tr>
    <td>050c</td> <td></td> <td></td> <td>X</td> <td></td> <td>Controller_Activity_Data</td> <td>ControlCardControlActivityData</td><td>sin desarrollar</td>
  </tr>
  <tr>
    <td>050d</td> <td></td> <td></td> <td></td> <td>X</td> <td>Company_Activity_Data</td> <td>CompanyActivityData</td><td>sin desarrollar</td>
  </tr>
  <tr>
    <td>050e</td> <td>X</td> <td></td> <td></td> <td></td> <td>Card_download</td> <td>LastCardDownload</td>
  </tr>
  <tr>
    <td>0520</td> <td>X</td> <td></td> <td>X</td> <td>X</td> <td>Identification</td> <td>Identification</td>
  </tr>
  <tr>
    <td>0521</td> <td>X</td> <td></td> <td></td> <td></td> <td>Driving_Licence_Info</td> <td>CardDrivingLicenceInformation</td>
  </tr>
  <tr>
    <td>0522</td> <td>X</td> <td>X</td> <td></td> <td></td> <td>Specific_Conditions</td> <td>SpecificConditionRecord</td>
  </tr>
</table>

  
  
  
  Las clases desarrolladas son todas para poder interpretar la tarjeta del conductor, por lo que las clases de 
  las tarjetas de ensayo, control y empresa no estan desarolladas.

  Las bloques de memoria vienen asociados junto con su firma digital la cual se ignora ya que lo que interesa de este
  proyecto es la interpretación de los datos contenidos de los ficheros binarios de datos.
  
  Los ficheros del tacografo tendran un nombre con el formato: 
  C_N....N_C...C_YYYYMMDD_HHMM.TGD
  C: identificador el tipo de fichero.
  N...N: numero de la tarjeta(16 caracteres)
  C...C: pais emisor de la tarjeta
  YYYY: año.
  MM: mes.
  DD: dia.
  HH: hora
  MM: minutos
  TGD:extension del fichero
  
  aunque el nombre no es indispensable para la interpretacion de los ficheros.
  
  Dichos ficheros son ficheros maestros los cuales estan divididos en bloques de memorias grabados secuencialemente
  con el formato:
  Tag-longitud-value=FID-tamaño-datos
  
  <p>La dependencias del proyecto seran tres para poder pasar de una clase java a json:
  <ul>
    <li>-jackson-core-2.5.1.jar</li>
    <li>-jackson-databind-2.5.1.jar</li>
    <li>-jackson-annotations-2.5.1.jar</li>
  </ul>
  </p>
  <p> <a href="http://tacografojavadoc.valdepeace.com/">javadoc</a> del proyecto.</p>

### Runnable jar
En la carpeta jar encontraremos el archivo runnable-tgd.jar que es el ejecutable de la app:

 ```java -jar runnable-tgd.jar <path><archivo.TGD/ESM/DDD/C1B```