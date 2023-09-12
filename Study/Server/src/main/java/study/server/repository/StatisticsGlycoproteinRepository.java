package study.server.repository;

import org.springframework.stereotype.Repository;
import study.server.dto.statictics.glycoproteion.common.*;
import study.server.dto.statictics.glycoproteion.differentialtest.chartFolderColumn.*;
import study.server.dto.statictics.glycoproteion.differentialtest.chartFolderHeatmap.CFHeatmapChart;
import study.server.dto.statictics.glycoproteion.differentialtest.chartFolderHeatmap.CFHeatmapDTO;
import study.server.dto.statictics.glycoproteion.differentialtest.chartFolderHeatmap.ColorAxis;
import study.server.dto.statictics.glycoproteion.differentialtest.chartFolderHeatmap.ColorAxisLabels;
import study.server.dto.statictics.glycoproteion.differentialtest.chatFolderLine.CFLineDTO;
import study.server.dto.statictics.glycoproteion.differentialtest.chatFolderLine.CFLinePlotOption;
import study.server.dto.statictics.glycoproteion.differentialtest.chatFolderScatter.CFScatterDTO;
import study.server.dto.statictics.glycoproteion.differentialtest.chatFolderScatter.CFScatterSeriesData;
import study.server.dto.statictics.glycoproteion.differentialtest.chatFolderScatter.CFScatterSeriesDataData;
import study.server.dto.statictics.glycoproteion.normalization.chartGroupAfterBoxplot2.CGAfterBoxPlot2DTO;
import study.server.dto.statictics.glycoproteion.normalization.common.CFBoxPlotSeriesData;
import study.server.dto.statictics.glycoproteion.normalization.common.CFBoxPlotSeriesDataData;
import study.server.dto.statictics.glycoproteion.normalization.chartFolderAfterBoxplot2.CFAfterBoxPlot2DTO;
import study.server.dto.statictics.glycoproteion.normalization.chartFolderBeforeBoxplot1.CFBeforeBoxPlot1DTO;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StatisticsGlycoproteinRepository {
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
		study.server.dto.statictics.glycoproteion.differentialtest.chartFolderHeatmap.YAxis yAxis =
				study.server.dto.statictics.glycoproteion.differentialtest.chartFolderHeatmap.YAxis.builder().categories(yAxisCategories).title(yAxisTItle).build();
		List<List<Object>> stopList = new ArrayList<>();
		List<Object> stopItem = new ArrayList<>();
		stopItem.add(0);
		stopItem.add("#0000FF");
		stopList.add(stopItem);
		ColorAxisLabels colorAxisLabels = ColorAxisLabels.builder().format("{value:.2f}").build();
		ColorAxis colorAxis = ColorAxis.builder().min(-2).max(2).minColor("#0000FF").maxColor("#FF0000").stops(stopList).startOnTick(false).endOnTick(false).
				borderColor("none").labels(colorAxisLabels).build();
		List<study.server.dto.statictics.glycoproteion.differentialtest.chartFolderHeatmap.SeriesData> seriesDataList = new ArrayList<>();
		List<Object> datalist = new ArrayList<>();
		datalist.add(0);
		datalist.add(0);
		datalist.add(1.37);
		study.server.dto.statictics.glycoproteion.differentialtest.chartFolderHeatmap.SeriesData seriesData =
				study.server.dto.statictics.glycoproteion.differentialtest.chartFolderHeatmap.SeriesData.builder().name("Heatmap").borderWidth(0).
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
}
