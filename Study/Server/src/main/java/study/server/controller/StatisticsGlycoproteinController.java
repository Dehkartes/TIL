package study.server.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import study.server.dto.statictics.glycoproteion.common.Chart;
import study.server.dto.statictics.glycoproteion.common.Title;
import study.server.dto.statictics.glycoproteion.common.XAxis;
import study.server.dto.statictics.glycoproteion.common.YAxis;
import study.server.dto.statictics.glycoproteion.differentialtest.chartFolderColumn.*;
import study.server.dto.statictics.glycoproteion.differentialtest.chartFolderHeatmap.ChartFolderHeatmapDTO;
import study.server.dto.statictics.glycoproteion.differentialtest.chartFolderHeatmap.ColorAxis;
import study.server.dto.statictics.glycoproteion.differentialtest.chartFolderHeatmap.ColorAxisLabels;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/statistics/glycoprotein")
public class StatisticsGlycoproteinController {
	@GetMapping("/differentialtest/chart/folder/column")
	public String getDifferentialtestChartFolderColumn() throws JsonProcessingException {
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

		ChartFolderColumnDTO inst = ChartFolderColumnDTO.builder().
		chart(chart).title(title).xAxis(xAxis).yAxis(yAxis).plotOptions(plotOptions).series(seriesDataList)
		.build();

		ObjectMapper objectMapper = new ObjectMapper();
		String json = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(inst);
		System.out.println(json);
		return json;
	}

	@GetMapping("/differentialtest/chart/folder/heatmap")
	public String getDifferentialtestChartFolderHeatmap() throws JsonProcessingException {
		study.server.dto.statictics.glycoproteion.differentialtest.chartFolderHeatmap.Chart chart =
				study.server.dto.statictics.glycoproteion.differentialtest.chartFolderHeatmap.Chart.builder().type("heatmap").plotBorderWidth(1).build();
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

		ChartFolderHeatmapDTO inst = ChartFolderHeatmapDTO.builder().chart(chart).title(title).xAxis(xAxis).yAxis(yAxis).
				colorAxis(colorAxis).series(seriesDataList).build();

		ObjectMapper objectMapper = new ObjectMapper();
		String json = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(inst);
		System.out.println(json);
		return json;
	}
}
