/*
	Copyright 2016 Marceau Dewilde <m@ceau.be>

	Licensed under the Apache License, Version 2.0 (the "License");
	you may not use this file except in compliance with the License.
	You may obtain a copy of the License at

		http://www.apache.org/licenses/LICENSE-2.0

	Unless required by applicable law or agreed to in writing, software
	distributed under the License is distributed on an "AS IS" BASIS,
	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
	See the License for the specific language governing permissions and
	limitations under the License.
*/
package be.ceau.chart.options.scales;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * The logarithmic scale is use to chart numerical data. It can be placed on
 * either the x or y axis. As the name suggests, logarithmic interpolation is
 * used to determine where a value lies on the axis.
 */
@JsonInclude(Include.NON_EMPTY)
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class LogarithmicScales {

	private List<LogarithmicScale> xAxes;
	
	private List<LogarithmicScale> yAxes;

	public List<LogarithmicScale> getxAxes() {
		return xAxes;
	}

	public LogarithmicScales setxAxes(List<LogarithmicScale> xAxes) {
		this.xAxes = xAxes;
	    return this;
	}

	public List<LogarithmicScale> getyAxes() {
		return yAxes;
	}

	public LogarithmicScales setyAxes(List<LogarithmicScale> yAxes) {
		this.yAxes = yAxes;
	    return this;
	}

}
