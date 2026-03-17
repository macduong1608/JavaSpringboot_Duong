package vn.be.platform_service.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;
import vn.be.platform_service.dto.ApiResponse;
import vn.be.platform_service.dto.ProductDTO;
import vn.be.platform_service.entity.Product;
import vn.be.platform_service.service.ProductService;

import java.util.List;

@RestController
@RequestMapping("/api/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping
    public ApiResponse<Page<ProductDTO>> getProducts(Pageable pageable) {
        return ApiResponse.success(productService.getProducts(pageable));
    }

    @GetMapping("/{id}")
    public ApiResponse<ProductDTO> getProductById(@PathVariable Long id) {
        return ApiResponse.success(productService.getProductById(id));
    }

    @PostMapping
    public ApiResponse<ProductDTO> addProduct(@RequestBody ProductDTO productDTO){
        return ApiResponse.success(productService.addProduct(productDTO));
    }

    @DeleteMapping("/{id}")
    public ApiResponse<Void> deleteProduct(@PathVariable Long id){
        productService.deleteProduct(id);
        return ApiResponse.success(null);
    }

    @PutMapping("/{id}")
    public ApiResponse<ProductDTO> updateProduct(@PathVariable Long id, @RequestBody ProductDTO productDTO){
        return ApiResponse.success(productService.updateProduct(id, productDTO));
    }

    @DeleteMapping("/{id}/soft")
    public ApiResponse<Void> deleteSoftProduct(@PathVariable Long id){
        productService.deleteSoftProduct(id);
        return ApiResponse.success(null);
    }
}
