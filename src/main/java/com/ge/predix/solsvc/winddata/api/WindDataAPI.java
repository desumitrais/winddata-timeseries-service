package com.ge.predix.solsvc.winddata.api;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import com.ge.predix.entity.timeseries.datapoints.ingestionrequest.Body;
import com.ge.predix.solsvc.common.ArduinoWrapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * 
 * @author predix -
 */
@Consumes(
{
        "application/json", "application/xml"
})
@Produces(
{
        "application/json", "application/xml"
})
@Path("/windservices")
@Api(value = "/windservices")
public interface WindDataAPI
{
    /**
     * @return -
     */
    @GET
    @Path("/ping")
    @ApiOperation(value = "/ping")
    public Response greetings();


    /**
     * @param id
     *            -
     * @param authorization
     *            -
     * @param starttime
     *            -
     * @param tagLimit -
     * @param tagorder -
     * @return -
     */
    @GET
    @Path("/yearly_data/sensor_id/{id}")
    @ApiOperation(value = "/yearly_data/sensor_id/{id}")
    public Response getYearlyWindDataPoints(@PathParam("id") String id,
            @HeaderParam(value = "Authorization") String authorization,
            @DefaultValue("1y-ago") @QueryParam("starttime") String starttime,
            @DefaultValue("25") @QueryParam("taglimit") String tagLimit,
            @DefaultValue("desc") @QueryParam("order") String tagorder);

    /**
     * @param id
     *            -
     * @param authorization
     *            -
     * @return -
     */
    @GET
    @Path("/latest_data/sensor_id/{id}")
    @ApiOperation(value = "/latest_data/sensor_id/{id}")
    public Response getLatestWindDataPoints(@PathParam("id") String id,
            @HeaderParam(value = "authorization") String authorization);

    /**
     * 
     * @param authorization -
     * @return List of tags
     */
    @GET
    @Path("/tags")
    @ApiOperation(value ="/tags")
    public Response getWindDataTags(@HeaderParam(value = "authorization") String authorization);

    @POST
    @Path("/temperature")
    @ApiOperation(value ="/temperature")
    public void addTempratureDataTags(@RequestBody ArduinoWrapper bodyMessage);

    @GET
    @Path("/temperature")
    @ApiOperation(value ="/temperature")
    public Response getTempratureByTags(@QueryParam("id") String id, @QueryParam("startDate") String startDate, @QueryParam("endDate") String endDate);

}
