package com.exe.exeschool.services.adminService;

import com.exe.exeschool.Data.Admin;

import java.util.List;

public interface AdminService {
    public Admin createAdmin(Admin admin);

    public Admin updateAdmin(Admin admin);

    public Admin getAdminById(Long id);

    public Admin getAdminByUsername(String username);

    public List<Admin> getAllAdmins();

    public void deleteAdmin(Long id);

}
