/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.3.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package kr.or.hanium.iam.api;

import kr.or.hanium.iam.api.model.TenantDto;
import kr.or.hanium.iam.api.model.UsableRoleDto;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
@Validated
@Api(value = "Tenant", description = "the Tenant API")
public interface TenantApi {

    /**
     * DELETE /api/v1/tenantd/{id}
     * Update a tenant with the specified id
     *
     * @param id Tenant ID (required)
     * @return OK (status code 200)
     */
    @ApiOperation(value = "", nickname = "deleteTenant", notes = "Update a tenant with the specified id", response = TenantDto.class, tags={ "tenant", })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK", response = TenantDto.class) })
    @RequestMapping(
            method = RequestMethod.DELETE,
            value = "/api/v1/tenantd/{id}",
            produces = { "application/json" }
    )
    ResponseEntity<TenantDto> deleteTenant(@ApiParam(value = "Tenant ID", required = true) @PathVariable("id") Integer id);


    /**
     * GET /api/v1/tenant/{id}
     * Get a tenant with the specified id
     *
     * @param id Tenant ID (required)
     * @return OK (status code 200)
     */
    @ApiOperation(value = "", nickname = "getTenant", notes = "Get a tenant with the specified id", response = TenantDto.class, tags={ "tenant", })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK", response = TenantDto.class) })
    @RequestMapping(
            method = RequestMethod.GET,
            value = "/api/v1/tenant/{id}",
            produces = { "application/json" }
    )
    ResponseEntity<TenantDto> getTenant(@ApiParam(value = "Tenant ID", required = true) @PathVariable("id") Integer id);


    /**
     * GET /api/v1/tenants
     *
     * @return Success (status code 200)
     */
    @ApiOperation(value = "", nickname = "getTenantList", notes = "", response = TenantDto.class, responseContainer = "List", tags={ "tenant", })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success", response = TenantDto.class, responseContainer = "List") })
    @RequestMapping(
            method = RequestMethod.GET,
            value = "/api/v1/tenants",
            produces = { "application/json" }
    )
    ResponseEntity<List<TenantDto>> getTenantList();


    /**
     * GET /api/v1/usablerole/{id}
     * Get a UsableRole with the specified id
     *
     * @param id UsableRole ID (required)
     * @return OK (status code 200)
     */
    @ApiOperation(value = "", nickname = "getUsableRole", notes = "Get a UsableRole with the specified id", response = UsableRoleDto.class, tags={ "tenant", })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK", response = UsableRoleDto.class) })
    @RequestMapping(
            method = RequestMethod.GET,
            value = "/api/v1/usablerole/{id}",
            produces = { "application/json" }
    )
    ResponseEntity<UsableRoleDto> getUsableRole(@ApiParam(value = "UsableRole ID", required = true) @PathVariable("id") Integer id);


    /**
     * POST /api/v1/tenants
     * Create new Tenant
     *
     * @param tenantDto  (optional)
     * @return OK (status code 201)
     */
    @ApiOperation(value = "", nickname = "postTenant", notes = "Create new Tenant", response = TenantDto.class, tags={ "tenant", })
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "OK", response = TenantDto.class) })
    @RequestMapping(
            method = RequestMethod.POST,
            value = "/api/v1/tenants",
            produces = { "application/json" },
            consumes = { "application/json" }
    )
    ResponseEntity<TenantDto> postTenant(@ApiParam(value = "") @Valid @RequestBody(required = false) TenantDto tenantDto);


    /**
     * PUT /api/v1/tenants/{id}
     * Update a tenant with the specified id
     *
     * @param id Tenant ID (required)
     * @param tenantDto  (optional)
     * @return OK (status code 200)
     */
    @ApiOperation(value = "", nickname = "putTenant", notes = "Update a tenant with the specified id", response = TenantDto.class, tags={ "tenant", })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK", response = TenantDto.class) })
    @RequestMapping(
            method = RequestMethod.PUT,
            value = "/api/v1/tenants/{id}",
            produces = { "application/json" },
            consumes = { "application/json" }
    )
    ResponseEntity<TenantDto> putTenant(@ApiParam(value = "Tenant ID", required = true) @PathVariable("id") Integer id,@ApiParam(value = "") @Valid @RequestBody(required = false) TenantDto tenantDto);

}
