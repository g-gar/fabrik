package com.ggar.fabrik.test.singlepipeline;

import com.ggar.fabrik.application.Fabrik;
import com.ggar.fabrik.application.IFabrik;
import com.ggar.fabrik.application.fabrik.domain.*;
import com.ggar.fabrik.test.singlepipeline.event.NumberSquaringEvent;

import java.util.Collection;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ExecutorService executorService = Executors.newCachedThreadPool();
        IPipelineOrchestrator orchestrator = new PipelineOrchestrator() {
            @Override
            public IPipelineOrchestratorDetails getDetail() {
                return null;
            }

            @Override
            public State getCurrentState() {
                return null;
            }

            @Override
            public IPipelineOrchestrator start(IPipeline... pipelines) {
                return null;
            }

            @Override
            public IPipelineOrchestrator pause(IPipeline... pipelines) {
                return null;
            }

            @Override
            public IPipelineOrchestrator stop(IPipeline... pipelines) {
                return null;
            }

            @Override
            public Collection<IPipeline> getPipelines() {
                return this.pipelines;
            }
        };
        IFabrik fabrik = new Fabrik(executorService, orchestrator);
        IntStream.range(0, 5).forEach(i -> fabrik.accept(new NumberSquaringEvent(i)));
    }
}
