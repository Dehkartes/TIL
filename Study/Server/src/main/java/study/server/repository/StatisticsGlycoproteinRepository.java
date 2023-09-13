package study.server.repository;

import org.springframework.stereotype.Repository;
import study.server.dto.statictics.element.*;
import study.server.dto.statictics.glycoprotein.differentialtest.chartFolderColumn.*;
import study.server.dto.statictics.glycoprotein.differentialtest.chartFolderHeatmap.CFHeatmapChart;
import study.server.dto.statictics.glycoprotein.differentialtest.chartFolderHeatmap.CFHeatmapDTO;
import study.server.dto.statictics.glycoprotein.differentialtest.chartFolderHeatmap.ColorAxis;
import study.server.dto.statictics.glycoprotein.differentialtest.chartFolderHeatmap.ColorAxisLabels;
import study.server.dto.statictics.glycoprotein.differentialtest.chatFolderLine.CFLineDTO;
import study.server.dto.statictics.glycoprotein.differentialtest.chatFolderLine.CFLinePlotOption;
import study.server.dto.statictics.glycoprotein.differentialtest.chatFolderScatter.CFScatterDTO;
import study.server.dto.statictics.glycoprotein.differentialtest.chatFolderScatter.CFScatterSeriesData;
import study.server.dto.statictics.glycoprotein.differentialtest.chatFolderScatter.CFScatterSeriesDataData;
import study.server.dto.statictics.glycoprotein.normalization.chartGroupAfterBoxplot2.CGAfterBoxPlot2DTO;
import study.server.dto.statictics.glycoprotein.normalization.chartGroupBeforeBoxplot1.CGBeforeBoxplot1DTO;
import study.server.dto.statictics.glycoprotein.normalization.chartFolderAfterBoxplot2.CFAfterBoxPlot2DTO;
import study.server.dto.statictics.glycoprotein.normalization.chartFolderBeforeBoxplot1.CFBeforeBoxPlot1DTO;
import study.server.dto.statictics.glycoprotein.normalization.chartSingleAfterColumn2.CSAfterColumn2DTO;
import study.server.dto.statictics.glycoprotein.normalization.chartSingleBeforeColumn1.CSBeforeColumn1DTO;
import study.server.dto.statictics.glycoprotein.processing.chartGroupVenn.CGVennDTO;
import study.server.dto.statictics.glycoprotein.processing.chartGroupVenn.CGVennSeriesElement;
import study.server.dto.statictics.glycoprotein.processing.chartGroupVenn.CGVennSeriesDataElement;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StatisticsGlycoproteinRepository<CGVennDTOSeriesElement> {
	public CFColumnDTO getCFColumnDTO() {
		Chart chart = Chart.builder().type("column").build();
		Title title = Title.builder().text("Distribution by Glycan_Types").build();
		List<String> xAxisCategories = new ArrayList<>();
		xAxisCategories.add("C/H");
		xAxisCategories.add("C/H-F");
		xAxisCategories.add("HM");
		Title titleXAxis = Title.builder().text("Glycan_types").build();
		XAxis xAxis = XAxis.builder().categories(xAxisCategories).title(titleXAxis).build();
		Title titleYAxis = Title.builder().text("Relative Abundance (%)").build();
		YAxis yAxis = YAxis.builder().title(titleYAxis).build();
		DataLabels dataLabels = DataLabels.builder().enabled(false).build();
		Column column = Column.builder().dataLabels(dataLabels).build();
		PlotOptions plotOptions = PlotOptions.builder().column(column).build();
		List<SeriesData> seriesDataList = new ArrayList<>();
		List<Double> seriesDataDoubleList = new ArrayList<>();
		seriesDataDoubleList.add(100.0);
		seriesDataDoubleList.add(100.0);
		seriesDataDoubleList.add(100.0);
		SeriesData seriesData = SeriesData.builder().name("Area_S1").data(seriesDataDoubleList).build();
		seriesDataList.add(seriesData);

		CFColumnDTO inst = CFColumnDTO.builder().
				chart(chart).title(title).xAxis(xAxis).yAxis(yAxis).plotOptions(plotOptions).series(seriesDataList)
				.build();

		return inst;
	}

	public CFHeatmapDTO getCFHeatmapDTO() {
		CFHeatmapChart chart = CFHeatmapChart
				.builder()
				.type("heatmap")
				.plotBorderWidth(1)
				.build();
		Title title = Title.builder().text("N-linked_heatmap").build();
		List<String> categoris = new ArrayList<>();
		categoris.add("EHEGAIYPDNTTDFQR+HexNAc(4)Hex(5)NeuAc(2)");
		Title xAxisTitle = Title.builder().text("").build();
		XAxis xAxis = XAxis.builder().categories(categoris).title(xAxisTitle).build();
		List<String> yAxisCategories = new ArrayList<>();
		yAxisCategories.add("Area_S1");
		Title yAxisTItle = Title.builder().text("").build();
		study.server.dto.statictics.glycoprotein.differentialtest.chartFolderHeatmap.YAxis yAxis =
				study.server.dto.statictics.glycoprotein.differentialtest.chartFolderHeatmap.YAxis.builder().categories(yAxisCategories).title(yAxisTItle).build();
		List<List<Object>> stopList = new ArrayList<>();
		List<Object> stopItem = new ArrayList<>();
		stopItem.add(0);
		stopItem.add("#0000FF");
		stopList.add(stopItem);
		ColorAxisLabels colorAxisLabels = ColorAxisLabels.builder().format("{value:.2f}").build();
		ColorAxis colorAxis = ColorAxis.builder().min(-2).max(2).minColor("#0000FF").maxColor("#FF0000").stops(stopList).startOnTick(false).endOnTick(false).
				borderColor("none").labels(colorAxisLabels).build();
		List<study.server.dto.statictics.glycoprotein.differentialtest.chartFolderHeatmap.SeriesData> seriesDataList = new ArrayList<>();
		List<Object> datalist = new ArrayList<>();
		datalist.add(0);
		datalist.add(0);
		datalist.add(1.37);
		study.server.dto.statictics.glycoprotein.differentialtest.chartFolderHeatmap.SeriesData seriesData =
				study.server.dto.statictics.glycoprotein.differentialtest.chartFolderHeatmap.SeriesData.builder().name("Heatmap").borderWidth(0).
						data(datalist).turboThreshold(456).build();
		seriesDataList.add(seriesData);

		CFHeatmapDTO inst = CFHeatmapDTO.builder().chart(chart).title(title).xAxis(xAxis).yAxis(yAxis).
				colorAxis(colorAxis).series(seriesDataList).build();

		return inst;
	}

	public CFLineDTO getCFLineDTO() {
		Chart chart = Chart.builder().type("line").build();
		Title title = Title.builder().text("Relative quantification of top N glycopeptides").build();
		List<String> categoriesList = new ArrayList<>();
		categoriesList.add("GLNVTLSSTGR+HexNAc(4)Hex(5)NeuAc(2)");
		categoriesList.add("EADDFFTSLGLLPVPPEFWNK+HexNAc(4)Hex(5)NeuAc(2)");
		XAxis xAxis = XAxis.builder().categories(categoriesList).title(Title.builder().text("Glycopeptide Type").build()).build();
		YAxis yAxis = YAxis.builder().title(Title.builder().text("Normalized Intensity").build()).build();
		Line line = Line.builder().dataLabels(DataLabels.builder().enabled(false).build()).marker(Marker.builder().enabled(true).build()).build();
		CFLinePlotOption cfLinePlotOption = CFLinePlotOption.builder().line(line).build();
		List<SeriesData> seriesDataList = new ArrayList<>();
		List<Double> series1data = new ArrayList<>();
		series1data.add(100.0);
		series1data.add(88.02686731702161);
		SeriesData series1 = SeriesData.builder().name("Area_S1").data(series1data).build();
		seriesDataList.add(series1);
		List<Double> series2data = new ArrayList<>();
		series2data.add(98.0421712533604);
		series2data.add(86.25339510506882);
		SeriesData series2 = SeriesData.builder().name("Area_S2").data(series2data).build();
		seriesDataList.add(series2);
		CFLineDTO inst = CFLineDTO.builder()
				.chart(chart)
				.title(title)
				.xAxis(xAxis)
				.yAxis(yAxis)
				.plotOptions(cfLinePlotOption)
				.series(seriesDataList)
				.build();

		return inst;
	}

	public CFScatterDTO getCFScatterDTO() {
		List<CFScatterSeriesData> seriesList = new ArrayList<>();
		List<CFScatterSeriesDataData> seriesDataDataList = new ArrayList<>();
		seriesDataDataList.add(CFScatterSeriesDataData.builder()
				.key("NYTDEAIETDDLTIK+HexNAc(4)Hex(5)NeuAc(2)")
				.x(13.87)
				.y(-0.76)
				.build());
		seriesDataDataList.add(CFScatterSeriesDataData.builder()
				.key("NLHDNLSDLR+HexNAc(4)Hex(5)NeuAc(2)")
				.x(13.21)
				.y(-0.76)
				.build());
		CFScatterSeriesData data1 = CFScatterSeriesData.builder().name("MA").data(seriesDataDataList).build();

		List<CFScatterSeriesDataData> seriesDataDataList2 = new ArrayList<>();
		seriesDataDataList2.add(CFScatterSeriesDataData.builder()
				.key("DVNTTIMELLIMVYACK+HexNAc(4)Hex(5)NeuAc(2)")
				.x(13.800204934529152)
				.y(3.040270437040869)
				.build());
		seriesDataDataList2.add(CFScatterSeriesDataData.builder()
				.key("LTACQVATAFNLSR+HexNAc(4)Hex(5)NeuAc(2)")
				.x(13.350720427734965)
				.y(2.0104300615632553)
				.build());
		CFScatterSeriesData data2 = CFScatterSeriesData.builder().name("Upregulated").data(seriesDataDataList2).build();

		seriesList.add(data1);
		seriesList.add(data2);

		CFScatterDTO inst = CFScatterDTO.builder()
				.chart(Chart.builder()
						.type("scatter")
						.zoomType("xy")
						.build())
				.title(Title.builder()
						.text("MA Plot")
						.build())
				.xAxis(XAxis.builder()
						.title(Title.builder()
								.text("A").build())
						.build())
				.yAxis(YAxis.builder()
						.title(Title.builder()
								.text("M").build())
						.build())
				.tooltip(Tooltip.builder()
						.pointFormat("<b>{point.key}</b><br> A = {point.x:.2f}, M = {point.y:.2f}")
						.build())
				.series(seriesList)
				.build();

		return inst;
	}

	public CFAfterBoxPlot2DTO getCFAfterBoxPlot2() {
		List<String> catagoris = new ArrayList<>();
		catagoris.add("1_1 Intensity");
		catagoris.add("1_2 Intensity");

		List<CFBoxPlotSeriesData> seriesDataList= new ArrayList<>();
		List<CFBoxPlotSeriesDataData> seriesDataDataList = new ArrayList<>();

		seriesDataDataList.add(CFBoxPlotSeriesDataData.builder()
				.name("1_1 Intensity")
				.x(0)
				.low(-1.2)
				.q1(4.29)
				.median(5.74)
				.q3(7.2)
				.high(17.55)
				.fillColor("#7cb5ec")
				.build());
		seriesDataDataList.add(CFBoxPlotSeriesDataData.builder()
				.name("1_2 Intensity")
				.x(1)
				.low(-0.79)
				.q1(4.36)
				.median(5.73)
				.q3(7.23)
				.high(17.0)
				.fillColor("#7cb5ec")
				.build());

		seriesDataList.add(CFBoxPlotSeriesData.builder().data(seriesDataDataList).build());

		CFAfterBoxPlot2DTO inst = CFAfterBoxPlot2DTO.builder()
				.chart(Chart.builder()
						.type("boxplot")
						.build())
				.plotOptions(PlotOptions.builder()
						.series(Series.builder()
								.pointWidth(100)
								.build())
						.build())
				.title(Title.builder().
						text("before_central_tendency_correction_boxplot")
						.build())
				.legend(Legend.builder()
						.enabled("false")
						.build())
				.xAxis(XAxis.builder()
						.categories(catagoris)
						.build())
				.series(seriesDataList)
				.build();

		return inst;
	}

	public CFBeforeBoxPlot1DTO getCFBeforeBoxPlot1() {
		List<String> catagoris = new ArrayList<>();
		catagoris.add("1_1 Intensity");
		catagoris.add("1_2 Intensity");

		List<CFBoxPlotSeriesData> seriesDataList= new ArrayList<>();
		List<CFBoxPlotSeriesDataData> seriesDataDataList = new ArrayList<>();

		seriesDataDataList.add(CFBoxPlotSeriesDataData.builder()
				.name("1_1 Intensity")
				.x(0)
				.low(-1.2)
				.q1(4.29)
				.median(5.74)
				.q3(7.2)
				.high(17.55)
				.fillColor("#7cb5ec")
				.build());
		seriesDataDataList.add(CFBoxPlotSeriesDataData.builder()
				.name("1_2 Intensity")
				.x(1)
				.low(-0.79)
				.q1(4.36)
				.median(5.73)
				.q3(7.23)
				.high(17.0)
				.fillColor("#7cb5ec")
				.build());

		seriesDataList.add(CFBoxPlotSeriesData.builder().data(seriesDataDataList).build());

		CFBeforeBoxPlot1DTO inst = CFBeforeBoxPlot1DTO.builder()
				.chart(Chart.builder()
						.type("boxplot")
						.build())
				.plotOptions(PlotOptions.builder()
						.series(Series.builder()
								.pointWidth(100)
								.build())
						.build())
				.title(Title.builder().
						text("before_central_tendency_correction_boxplot")
						.build())
				.legend(Legend.builder()
						.enabled("false")
						.build())
				.xAxis(XAxis.builder()
						.categories(catagoris)
						.build())
				.series(seriesDataList)
				.build();

		return inst;
	}

	public CGAfterBoxPlot2DTO getCGAfterBoxPlot2() {
		List<String> catagoris = new ArrayList<>();
		catagoris.add("1_1 Intensity");
		catagoris.add("1_2 Intensity");

		List<CFBoxPlotSeriesData> seriesDataList= new ArrayList<>();
		List<CFBoxPlotSeriesDataData> seriesDataDataList = new ArrayList<>();

		seriesDataDataList.add(CFBoxPlotSeriesDataData.builder()
				.name("1_1 Intensity")
				.x(0)
				.low(-1.2)
				.q1(4.29)
				.median(5.74)
				.q3(7.2)
				.high(17.55)
				.fillColor("#7cb5ec")
				.build());
		seriesDataDataList.add(CFBoxPlotSeriesDataData.builder()
				.name("1_2 Intensity")
				.x(1)
				.low(-0.79)
				.q1(4.36)
				.median(5.73)
				.q3(7.23)
				.high(17.0)
				.fillColor("#7cb5ec")
				.build());

		seriesDataList.add(CFBoxPlotSeriesData.builder().data(seriesDataDataList).build());

		CGAfterBoxPlot2DTO inst = CGAfterBoxPlot2DTO.builder()
				.chart(Chart.builder()
						.type("boxplot")
						.build())
				.plotOptions(PlotOptions.builder()
						.series(Series.builder()
								.pointWidth(100)
								.build())
						.build())
				.title(Title.builder().
						text("before_central_tendency_correction_boxplot")
						.build())
				.legend(Legend.builder()
						.enabled("false")
						.build())
				.xAxis(XAxis.builder()
						.categories(catagoris)
						.build())
				.series(seriesDataList)
				.build();

		return inst;
	}

	public CGBeforeBoxplot1DTO getCGBeforeBoxplot1DTO() {
		List<String> catagoris = new ArrayList<>();
		catagoris.add("1_1 Intensity");
		catagoris.add("1_2 Intensity");

		List<CFBoxPlotSeriesData> seriesDataList= new ArrayList<>();
		List<CFBoxPlotSeriesDataData> seriesDataDataList = new ArrayList<>();

		seriesDataDataList.add(CFBoxPlotSeriesDataData.builder()
				.name("1_1 Intensity")
				.x(0)
				.low(-1.2)
				.q1(4.29)
				.median(5.74)
				.q3(7.2)
				.high(17.55)
				.fillColor("#7cb5ec")
				.build());
		seriesDataDataList.add(CFBoxPlotSeriesDataData.builder()
				.name("1_2 Intensity")
				.x(1)
				.low(-0.79)
				.q1(4.36)
				.median(5.73)
				.q3(7.23)
				.high(17.0)
				.fillColor("#7cb5ec")
				.build());

		seriesDataList.add(CFBoxPlotSeriesData.builder().data(seriesDataDataList).build());

		CGBeforeBoxplot1DTO inst = CGBeforeBoxplot1DTO.builder()
				.chart(Chart.builder()
						.type("boxplot")
						.build())
				.plotOptions(PlotOptions.builder()
						.series(Series.builder()
								.pointWidth(100)
								.build())
						.build())
				.title(Title.builder().
						text("before_central_tendency_correction_boxplot")
						.build())
				.legend(Legend.builder()
						.enabled("false")
						.build())
				.xAxis(XAxis.builder()
						.categories(catagoris)
						.build())
				.series(seriesDataList)
				.build();

		return inst;
	}

	public CSAfterColumn2DTO getCSAfterColumn2DTO() {
		List<Integer> seriesData = new ArrayList<>();
		seriesData.add(9);
		seriesData.add(59);
		List<CSColumn2SeriesData> series = new ArrayList<>();
		series.add(CSColumn2SeriesData.builder()
				.name("Histogram")
				.data(seriesData)
				.pointStart(-1.2209159452867755)
				.pointInterval(1.8768498218272325)
				.build());
		series.add(CSColumn2SeriesData.builder()
				.name("Histogram")
				.data(seriesData)
				.pointStart(-1.2209159452867755)
				.pointInterval(1.8768498218272325)
				.build());

		CSAfterColumn2DTO inst = CSAfterColumn2DTO.builder()
				.chart(Chart.builder()
						.type("colum")
						.build())
				.title(Title.builder()
						.text("after_norm 1_1 Intensity")
						.build())
				.xAxis(XAxis.builder()
						.title(Title.builder()
								.text("1_1 Intensity")
								.build())
						.build())
				.yAxis(YAxis.builder()
						.title(Title.builder()
								.text("Count")
								.build())
						.build())
				.series(series)
				.build();

		return inst;
	}

	public CSBeforeColumn1DTO getCSBeforeColumn1DTO() {
		List<Integer> seriesData = new ArrayList<>();
		seriesData.add(9);
		seriesData.add(59);
		List<CSColumn2SeriesData> series = new ArrayList<>();
		series.add(CSColumn2SeriesData.builder()
				.name("Histogram")
				.data(seriesData)
				.pointStart(-1.2209159452867755)
				.pointInterval(1.8768498218272325)
				.build());
		series.add(CSColumn2SeriesData.builder()
				.name("Histogram")
				.data(seriesData)
				.pointStart(-1.2209159452867755)
				.pointInterval(1.8768498218272325)
				.build());

		CSBeforeColumn1DTO inst = CSBeforeColumn1DTO.builder()
				.chart(Chart.builder()
						.type("colum")
						.build())
				.title(Title.builder()
						.text("after_norm 1_1 Intensity")
						.build())
				.xAxis(XAxis.builder()
						.title(Title.builder()
								.text("1_1 Intensity")
								.build())
						.build())
				.yAxis(YAxis.builder()
						.title(Title.builder()
								.text("Count")
								.build())
						.build())
				.series(series)
				.build();

		return inst;
	}

	public CGVennDTO getCGVennDTO() {


		List<CGVennSeriesElement> cgVennSeriesElementList = new ArrayList<>();
		List<CGVennSeriesDataElement> cGvennSeriesDataElementList = new ArrayList<>();
		List<String> setList1 = new ArrayList<>();
		setList1.add("Area_S1");
		setList1.add("Area_S1");
		cGvennSeriesDataElementList.add(CGVennSeriesDataElement.builder()
				.name("<b>245</b><br>34.36%")
				.sets(setList1)
				.value(449)
				.build());
		List<String> setList2 = new ArrayList<>();
		setList2.add("Area_S2");
		setList2.add("Area_S2");
		cGvennSeriesDataElementList.add(CGVennSeriesDataElement.builder()
				.name("<b>214</b><br>30.01%")
				.sets(setList2)
				.value(418)
				.build());
		cgVennSeriesElementList.add(CGVennSeriesElement.builder()
						.data(cGvennSeriesDataElementList)
				.build());
		cgVennSeriesElementList.add(CGVennSeriesElement.builder()
				.data(cGvennSeriesDataElementList)
				.build());

		CGVennDTO inst = CGVennDTO.builder()
				.chart(Chart.builder()
						.type("venn")
						.build())
				.title(Title.builder()
						.text("Venn Diagram")
						.build())
				.series(cgVennSeriesElementList)
				.build();

		return inst;
	}
}
