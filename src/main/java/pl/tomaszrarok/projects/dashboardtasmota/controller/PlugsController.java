package pl.tomaszrarok.projects.dashboardtasmota.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pl.tomaszrarok.projects.dashboardtasmota.model.Plug;
import io.swagger.annotations.*;

import java.util.List;

@RestController
public class PlugsController {

    /**
     * GET /plugs : List all plugs
     *
     * @return A array of plugs (status code 200)
     *         or unexpected error (status code 200)
     */
    @ApiOperation(value = "List all plugs", nickname = "listPlugs", notes = "", response = Plug.class, responseContainer = "List", tags={ "plugs", })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "A array of plugs", response = Plug.class, responseContainer = "List"),
            @ApiResponse(code = 200, message = "unexpected error", response = Error.class) })
    @RequestMapping(value = "/plugs",
            produces = { "application/json" },
            method = RequestMethod.GET)
    public ResponseEntity<List<Plug>> listPlugs() {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /plugs/toogle/{plugName} : Toogle a specific plug
     *
     * @param plugName The name of plug to toogle (required)
     * @return Expected response to a valid request (status code 200)
     *         or unexpected error (status code 200)
     */
    @ApiOperation(value = "Toogle a specific plug", nickname = "tooglePlug", notes = "", response = Plug.class, tags={ "plugs", })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Expected response to a valid request", response = Plug.class),
            @ApiResponse(code = 200, message = "unexpected error", response = Error.class) })
    @RequestMapping(value = "/plugs/toogle/{plugName}",
            produces = { "application/json" },
            method = RequestMethod.GET)
    public ResponseEntity<Plug> tooglePlug(@ApiParam(value = "The name of plug to toogle",required=true) @PathVariable("plugName") String plugName) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

}
