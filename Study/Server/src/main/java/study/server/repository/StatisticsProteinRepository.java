package study.server.repository;

import org.springframework.stereotype.Repository;
import study.server.dto.statictics.element.*;
import study.server.dto.statictics.protein.normalization.chartSingleAfterColumn2.CSAfterColumn2DTO;
import study.server.dto.statictics.element.CSColumn2PlotOption;
import study.server.dto.statictics.element.CSColumn2PlotOptionSeries;
import study.server.dto.statictics.protein.normalization.chartSingleBeforeColumn1.CSBeforeColumn1DTO;
import study.server.dto.statictics.protein.normalization.chartGroupAfterBoxplot2.CGAfterBoxPlot2DTO;
import study.server.dto.statictics.protein.normalization.chartGroupBeforeBoxplot1.CGBeforeBoxplot1DTO;
import study.server.dto.statictics.protein.normalization.chartFolderBeforeBoxplot1.CFBeforeBoxPlot1DTO;
import study.server.dto.statictics.protein.normalization.chartFolderAfterBoxplot2.CFAfterBoxPlot2DTO;
import study.server.dto.statictics.protein.differentialtest.chartFolderHeatmap.HmSeriesData;
import study.server.dto.statictics.protein.differentialtest.chartFolderHeatmap.YAxis;
import study.server.dto.statictics.protein.differentialtest.chatFolderScatter.*;
import study.server.dto.statictics.protein.differentialtest.chartFolderHeatmap.*;
import study.server.dto.statictics.protein.processing.chartGroupVenn1.CGVenn1DTO;
import study.server.dto.statictics.protein.processing.chartGroupVenn2.CGVenn2DTO;
import study.server.dto.statictics.protein.processing.chartSingleQqplotAfter.CSQqplotAfterDTO;
import study.server.dto.statictics.protein.processing.chartSingleQqplotBefore.CSQqplotBeforeDTO;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StatisticsProteinRepository {
	public CFHeatmapDTO getCFHeatmapDTO() {
		CFHeatmapChart chart = CFHeatmapChart
				.builder()
				.type("heatmap")
				.plotBorderWidth(1)
				.build();
		Title title = Title.builder().text("DEP_heatmap").build();
		List<String> categoris = new ArrayList<>();
		categoris.add("Znf638");
		categoris.add("Gba2");
		Title xAxisTitle = Title.builder().text("").build();
		XAxis xAxis = XAxis.builder().categories(categoris).title(xAxisTitle).build();
		List<String> yAxisCategories = new ArrayList<>();
		yAxisCategories.add("1_1 Intensity");
		yAxisCategories.add("1_2 Intensity");
		Title yAxisTItle = Title.builder().text("").build();
		YAxis yAxis = YAxis.builder()
				.categories(yAxisCategories)
				.title(yAxisTItle)
				.build();
		List<List<Object>> stopList = new ArrayList<>();
		List<Object> stopItem = new ArrayList<>();
		stopItem.add(0);
		stopItem.add("#0000FF");
		stopList.add(stopItem);
		List<Object> stopItem2 = new ArrayList<>();
		stopItem.add(0.5);
		stopItem.add("#FFFFFF");
		stopList.add(stopItem2);
		ColorAxisLabels colorAxisLabels = ColorAxisLabels.builder().format("{value:.2f}").build();
		ColorAxis colorAxis = ColorAxis.builder().min(-2).max(2).minColor("#0000FF").maxColor("#FF0000").stops(stopList).startOnTick(false).endOnTick(false).
				borderColor("none").labels(colorAxisLabels).build();
		List<HmSeriesData> seriesDataList = new ArrayList<>();
		List<Object> datalist = new ArrayList<>();
		List<Object> dataelement1 = new ArrayList<>();
		dataelement1.add(0);
		dataelement1.add(0);
		dataelement1.add(1.38);

		List<Object> dataelement2 = new ArrayList<>();
		dataelement2.add(0);
		dataelement2.add(1);
		dataelement2.add(1.03);

		datalist.add(dataelement1);
		datalist.add(dataelement2);
		HmSeriesData seriesData = HmSeriesData.builder()
				.name("Heatmap")
				.borderWidth(0)
				.data(datalist)
				.turboThreshold(456)
				.build();
		seriesDataList.add(seriesData);

		List<Object> datalistb = new ArrayList<>();
		List<Object> dataelement1b = new ArrayList<>();
		dataelement1b.add(0);
		dataelement1b.add(0);
		dataelement1b.add(1.38);

		List<Object> dataelement2b = new ArrayList<>();
		dataelement2b.add(0);
		dataelement2b.add(1);
		dataelement2b.add(1.03);

		datalistb.add(dataelement1b);
		datalistb.add(dataelement2b);
		HmSeriesData seriesData2 = HmSeriesData.builder()
				.name("Heatmap")
				.borderWidth(0)
				.data(datalistb)
				.turboThreshold(456)
				.build();
		seriesDataList.add(seriesData2);

		CFHeatmapDTO inst = CFHeatmapDTO.builder().chart(chart).title(title).xAxis(xAxis).yAxis(yAxis).
				colorAxis(colorAxis).series(seriesDataList).build();

		return inst;
	}

	public CFScatterDTO getCFScatterDTO() {
		List<CFScatterSeriesData> seriesList = new ArrayList<>();
		List<CFScatterSeriesDataData> seriesDataDataList = new ArrayList<>();
		seriesDataDataList.add(CFScatterSeriesDataData.builder()
				.key("Cul4b")
				.x(6.46)
				.y(-0.25)
				.build());
		seriesDataDataList.add(CFScatterSeriesDataData.builder()
				.key("Arfgef2")
				.x(7.79)
				.y(0.65)
				.build());
		CFScatterSeriesData data1 = CFScatterSeriesData.builder().name("MA").data(seriesDataDataList).build();

		List<CFScatterSeriesDataData> seriesDataDataList2 = new ArrayList<>();
		seriesDataDataList2.add(CFScatterSeriesDataData.builder()
				.key("Map7d2")
				.x(7.63)
				.y(0.17)
				.build());
		seriesDataDataList2.add(CFScatterSeriesDataData.builder()
				.key("Camsap1")
				.x(4.8)
				.y(-1.74)
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
				.yAxis(study.server.dto.statictics.element.YAxis.builder()
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
		seriesData.add(5);
		seriesData.add(4);
		List<CSColumn2SeriesData> series = new ArrayList<>();
		series.add(CSColumn2SeriesData.builder()
				.name("Histogram")
				.data(seriesData)
				.pointStart(1.283705103104668)
				.pointInterval(0.4437205525474461)
				.build());
		series.add(CSColumn2SeriesData.builder()
				.name("Histogram")
				.data(seriesData)
				.pointStart(1.283705103104668)
				.pointInterval(0.4437205525474461)
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
				.plotOption(CSColumn2PlotOption.builder()
						.series(CSColumn2PlotOptionSeries.builder()
								.pointPadding(0)
								.groupPadding(0)
								.borderWidth(0.5)
								.borderColor("rgba(255,255,255,0.5)")
								.build())
						.build())
				.series(series)
				.build();

		return inst;
	}

	public CSBeforeColumn1DTO getCSBeforeColumn1DTO() {
		List<Integer> seriesData = new ArrayList<>();
		seriesData.add(5);
		seriesData.add(4);
		List<CSColumn2SeriesData> series = new ArrayList<>();
		series.add(CSColumn2SeriesData.builder()
				.name("Histogram")
				.data(seriesData)
				.pointStart(-612716672.4048)
				.pointInterval(14289602480.7536)
				.build());
		series.add(CSColumn2SeriesData.builder()
				.name("Histogram")
				.data(seriesData)
				.pointStart(-612716672.4048)
				.pointInterval(14289602480.7536)
				.build());

		CSBeforeColumn1DTO inst = CSBeforeColumn1DTO.builder()
				.chart(Chart.builder()
						.type("colum")
						.build())
				.title(Title.builder()
						.text("before_norm 1_1 Intensity")
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
				.plotOption(CSColumn2PlotOption.builder()
						.series(CSColumn2PlotOptionSeries.builder()
								.pointPadding(0)
								.groupPadding(0)
								.borderWidth(0.5)
								.borderColor("rgba(255,255,255,0.5)")
								.build())
						.build())
				.series(series)
				.build();

		return inst;
	}

	public CGVenn1DTO getCGVenn1DTO() {
		List<CGVennDataElement> cgVennDataElementList = new ArrayList<>();
		List<String> sets1 = new ArrayList<>();
		sets1.add("1_1 Intensity");
		List<String> sets2 = new ArrayList<>();
		sets2.add("1_2 Intensity");
		cgVennDataElementList.add(CGVennDataElement.builder()
				.name("<b>427</b><br>11.89%")
				.sets(sets1)
				.value(3189)
				.build());
		cgVennDataElementList.add(CGVennDataElement.builder()
				.name("<b>484</b><br>13.47%")
				.sets(sets2)
				.value(3268)
				.build());

		CGVenn1DTO inst = CGVenn1DTO.builder()
				.type("venn")
				.titie("Group 1: The number of shared proteins")
				.data(cgVennDataElementList)
				.build();

		return inst;
	}

	public CGVenn2DTO getCGVenn2DTO() {
		List<CGVennDataElement> cgVennDataElementList = new ArrayList<>();
		List<String> sets1 = new ArrayList<>();
		sets1.add("2_1 Intensity");
		List<String> sets2 = new ArrayList<>();
		sets2.add("2_2 Intensity");
		cgVennDataElementList.add(CGVennDataElement.builder()
				.name("<b>427</b><br>11.89%")
				.sets(sets1)
				.value(3292)
				.build());
		cgVennDataElementList.add(CGVennDataElement.builder()
				.name("<b>484</b><br>13.47%")
				.sets(sets2)
				.value(3349)
				.build());

		CGVenn2DTO inst = CGVenn2DTO.builder()
				.type("venn")
				.titie("Group 1: The number of shared proteins")
				.data(cgVennDataElementList)
				.build();

		return inst;
	}

	public CSQqplotAfterDTO getCSQqplotAfterDTO() {
		List<SeriesDataqq> seriesDataList = new ArrayList<>();
		List<List<Double>> seriesDataDataList = new ArrayList<>();
		List<Double> seriesDataDataDataList01 = new ArrayList<>();
		seriesDataDataDataList01.add(-2.3263478740408408);
		seriesDataDataDataList01.add(663236.06);
		List<Double> seriesDataDataDataList02 = new ArrayList<>();
		seriesDataDataDataList02.add(-2.3263478740408408);
		seriesDataDataDataList02.add(663236.06);
		seriesDataDataList.add(seriesDataDataDataList01);
		seriesDataDataList.add(seriesDataDataDataList02);
		seriesDataList.add(SeriesDataqq.builder()
						.name("qqplot")
						.data(seriesDataDataList)
				.build());

		List<List<Double>> seriesDataDataList11 = new ArrayList<>();
		List<Double> seriesDataDataDataList11 = new ArrayList<>();
		seriesDataDataDataList11.add(-2.3263478740408408);
		seriesDataDataDataList11.add(663236.06);
		List<Double> seriesDataDataDataList12 = new ArrayList<>();
		seriesDataDataDataList12.add(-2.3263478740408408);
		seriesDataDataDataList12.add(663236.06);
		seriesDataDataList11.add(seriesDataDataDataList11);
		seriesDataDataList11.add(seriesDataDataDataList12);
		seriesDataList.add(SeriesDataqq.builder()
						.type("line")
						.name("Theoretical Line")
						.data(seriesDataDataList11)
						.color("red")
						.marker(Marker.builder()
								.enabled(false)
								.build())
				.build());

		CSQqplotAfterDTO inst = CSQqplotAfterDTO.builder()
				.chart(Chart.builder()
						.type("scatter")
						.zoomType("xy")
						.build())
				.title(Title.builder()
						.text("1_2 Intensity_qqplot_after")
						.build())
				.xAxis(XAxis.builder()
						.title(Title.builder()
								.text("Theoretical Quantiles")
								.build())
						.build())
				.yAxis(YAxis.builder()
						.title(Title.builder()
								.text("Sample Quantiles")
								.build())
						.build())
				.series(seriesDataList)
				.build();

		return inst;
	}

	public CSQqplotBeforeDTO getCSQqplotBeforeDTO() {
		List<SeriesDataqq> seriesDataList = new ArrayList<>();
		List<List<Double>> seriesDataDataList = new ArrayList<>();
		List<Double> seriesDataDataDataList01 = new ArrayList<>();
		seriesDataDataDataList01.add(-2.3263478740408408);
		seriesDataDataDataList01.add(663236.06);
		List<Double> seriesDataDataDataList02 = new ArrayList<>();
		seriesDataDataDataList02.add(-2.3263478740408408);
		seriesDataDataDataList02.add(663236.06);
		seriesDataDataList.add(seriesDataDataDataList01);
		seriesDataDataList.add(seriesDataDataDataList02);
		seriesDataList.add(SeriesDataqq.builder()
				.name("qqplot")
				.data(seriesDataDataList)
				.build());

		List<List<Double>> seriesDataDataList11 = new ArrayList<>();
		List<Double> seriesDataDataDataList11 = new ArrayList<>();
		seriesDataDataDataList11.add(-2.3263478740408408);
		seriesDataDataDataList11.add(663236.06);
		List<Double> seriesDataDataDataList12 = new ArrayList<>();
		seriesDataDataDataList12.add(-2.3263478740408408);
		seriesDataDataDataList12.add(663236.06);
		seriesDataDataList11.add(seriesDataDataDataList11);
		seriesDataDataList11.add(seriesDataDataDataList12);
		seriesDataList.add(SeriesDataqq.builder()
				.type("line")
				.name("Theoretical Line")
				.data(seriesDataDataList11)
				.color("red")
				.marker(Marker.builder()
						.enabled(false)
						.build())
				.build());

		CSQqplotBeforeDTO inst = CSQqplotBeforeDTO.builder()
				.chart(Chart.builder()
						.type("scatter")
						.zoomType("xy")
						.build())
				.title(Title.builder()
						.text("1_2 Intensity_qqplot_after")
						.build())
				.xAxis(XAxis.builder()
						.title(Title.builder()
								.text("Theoretical Quantiles")
								.build())
						.build())
				.yAxis(YAxis.builder()
						.title(Title.builder()
								.text("Sample Quantiles")
								.build())
						.build())
				.series(seriesDataList)
				.build();

		return inst;
	}
}
