# Chart.java

  [![Javadocs](https://javadoc.io/badge/be.ceau/chart.svg)](https://javadoc.io/doc/be.ceau/chart)  [![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://www.apache.org/licenses/LICENSE-2.0.txt)

Chart.java enables integration with the excellent [Chart.js](http://www.chartjs.org/) library from within a Java application.

### Usage example

In Java:

```Java
BarDataset dataset = new BarDataset()
		.setLabel("sample chart")
		.setData(65, 59, 80, 81, 56, 55, 40)
		.addBackgroundColors(Color.RED, Color.GREEN, Color.BLUE, Color.YELLOW, Color.ORANGE, Color.GRAY, Color.BLACK)
		.setBorderWidth(2);

BarData data = new BarData()
		.addLabels("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
		.addDataset(dataset);

return new BarChart(data).toJson();
```

In JavaScript:

```JavaScript
var ctx = document.getElementById('canvasId'));
new Chart(ctx, json);
```

### Get Started
#### Maven
Include this project directly from Gotan Maven repository
```XML
<dependency>
	<groupId>io.gotan.os</groupId>
	<artifactId>chartjs4java</artifactId>
	<version>2.6.0-SNAPSHOT</version>
</dependency>
```

#### Download
Downloads for this project at [Gotan Maven OS Repository](https://repository.dev.gotan.io/#browse/browse:gotan.os:io%2Fgotan%2Fos%2Fchartjs4java).

### Documentation
#### Javadoc
Browse this project's javadoc at [javadoc.io](https://javadoc.io/doc/be.ceau/chart).

#### Other resources
The [docs for Chart.js](http://www.chartjs.org/docs/) are a helpful source of info on what's possible and how to achieve it.



### Compatibility

Chart.js | Chart.java
------------ | -------------
1.x | 0.9.x
2.x | 2.x

### Test
See example charts by running the included unit tests:
```XML
mvn clean compile test
```

### License
ChartJS4Java is licensed under [the Apache 2.0 license](https://www.apache.org/licenses/LICENSE-2.0.txt).   
Based and forked from [Chart.java](https://github.com/mdewilde)