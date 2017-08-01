package jbehavePackage;

import java.util.List;

import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.io.LoadFromClasspath;
import org.jbehave.core.junit.JUnitStories;
import org.jbehave.core.reporters.Format;
import org.jbehave.core.reporters.StoryReporterBuilder;
import org.jbehave.core.steps.InjectableStepsFactory;
import org.jbehave.core.steps.InstanceStepsFactory;

public class CalculatorExecutor extends JUnitStories {
	@Override
	public Configuration configuration(){
		return new MostUsefulConfiguration().
				useStoryLoader(new LoadFromClasspath(this.getClass())).
				useStoryReporterBuilder(new StoryReporterBuilder().withDefaultFormats().withFormats(Format.CONSOLE, Format.TXT, Format.HTML));
		
	}
	
	
    @Override
    public InjectableStepsFactory stepsFactory(){
    	return new InstanceStepsFactory(configuration(),  new CalculatorTestSteps());
    }


	@Override
	protected List<String> storyPaths() {
		// TODO Auto-generated method stub
		return null;
	}
} 