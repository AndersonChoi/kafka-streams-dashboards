package dev.buesing.ksd.publisher;

import com.beust.jcommander.Parameter;
import dev.buesing.ksd.tools.config.BaseOptions;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Options extends BaseOptions {

    @Parameter(names = { "--line-items" }, description = "use x:y for a range, single value for absolute")
    private String lineItemCount= "1";

    @Parameter(names = { "--pause" }, description = "")
    private Long pause = 1000L;

}
