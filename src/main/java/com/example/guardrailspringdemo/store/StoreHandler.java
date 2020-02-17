/*
 * This file was generated by Guardrail (https://github.com/twilio/guardrail).
 * Modifications will be overwritten; instead edit the OpenAPI/Swagger spec file.
*/
package com.example.guardrailspringdemo.store;

import java.util.Optional;
import java.util.concurrent.CompletionStage;
import javax.validation.constraints.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.async.DeferredResult;
import org.springframework.web.multipart.MultipartFile;
import com.example.guardrailspringdemo.*;
import com.example.guardrailspringdemo.definitions.*;

public interface StoreHandler {

    abstract class GetInventoryResponse {

        private final int statusCode;

        GetInventoryResponse(final int statusCode) {
            this.statusCode = statusCode;
        }

        public int getStatusCode() {
            return this.statusCode;
        }

        public static class Ok extends GetInventoryResponse {

            private final java.util.Map<String, Integer> entityBody;

            private Ok(final java.util.Map<String, Integer> entityBody) {
                super(200);
                this.entityBody = entityBody;
            }

            public java.util.Map<String, Integer> getEntityBody() {
                return this.entityBody;
            }
        }

        public static Ok Ok(final java.util.Map<String, Integer> entityBody) {
            return new Ok(entityBody);
        }
    }

    abstract class PlaceOrderResponse {

        private final int statusCode;

        PlaceOrderResponse(final int statusCode) {
            this.statusCode = statusCode;
        }

        public int getStatusCode() {
            return this.statusCode;
        }

        public static class Ok extends PlaceOrderResponse {

            private final com.example.guardrailspringdemo.definitions.Order entityBody;

            private Ok(final com.example.guardrailspringdemo.definitions.Order entityBody) {
                super(200);
                this.entityBody = entityBody;
            }

            public com.example.guardrailspringdemo.definitions.Order getEntityBody() {
                return this.entityBody;
            }
        }

        public static class BadRequest extends PlaceOrderResponse {

            private BadRequest() {
                super(400);
            }
        }

        public static final BadRequest BadRequest = new BadRequest();

        public static Ok Ok(final com.example.guardrailspringdemo.definitions.Order entityBody) {
            return new Ok(entityBody);
        }
    }

    abstract class GetOrderByIdResponse {

        private final int statusCode;

        GetOrderByIdResponse(final int statusCode) {
            this.statusCode = statusCode;
        }

        public int getStatusCode() {
            return this.statusCode;
        }

        public static class Ok extends GetOrderByIdResponse {

            private final com.example.guardrailspringdemo.definitions.Order entityBody;

            private Ok(final com.example.guardrailspringdemo.definitions.Order entityBody) {
                super(200);
                this.entityBody = entityBody;
            }

            public com.example.guardrailspringdemo.definitions.Order getEntityBody() {
                return this.entityBody;
            }
        }

        public static class BadRequest extends GetOrderByIdResponse {

            private BadRequest() {
                super(400);
            }
        }

        public static class NotFound extends GetOrderByIdResponse {

            private NotFound() {
                super(404);
            }
        }

        public static final BadRequest BadRequest = new BadRequest();

        public static final NotFound NotFound = new NotFound();

        public static Ok Ok(final com.example.guardrailspringdemo.definitions.Order entityBody) {
            return new Ok(entityBody);
        }
    }

    abstract class DeleteOrderResponse {

        private final int statusCode;

        DeleteOrderResponse(final int statusCode) {
            this.statusCode = statusCode;
        }

        public int getStatusCode() {
            return this.statusCode;
        }

        public static class BadRequest extends DeleteOrderResponse {

            private BadRequest() {
                super(400);
            }
        }

        public static class NotFound extends DeleteOrderResponse {

            private NotFound() {
                super(404);
            }
        }

        public static final BadRequest BadRequest = new BadRequest();

        public static final NotFound NotFound = new NotFound();
    }

    CompletionStage<StoreHandler.GetInventoryResponse> getInventory();

    CompletionStage<StoreHandler.PlaceOrderResponse> placeOrder(
            final com.example.guardrailspringdemo.definitions.Order body);

    CompletionStage<StoreHandler.GetOrderByIdResponse> getOrderById(final long orderId);

    CompletionStage<StoreHandler.DeleteOrderResponse> deleteOrder(final long orderId);
}