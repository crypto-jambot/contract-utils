package dev.rabbit.generated;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.RemoteFunctionCall;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tx.Contract;
import org.web3j.tx.TransactionManager;
import org.web3j.tx.gas.ContractGasProvider;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://docs.web3j.io/command_line.html">web3j command line tools</a>,
 * or the org.web3j.codegen.SolidityFunctionWrapperGenerator in the 
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version 4.9.4.
 */
@SuppressWarnings("rawtypes")
public class IUniswapV3PoolActions extends Contract {
    public static final String BINARY = "";

    public static final String FUNC_BURN = "burn";

    public static final String FUNC_COLLECT = "collect";

    public static final String FUNC_FLASH = "flash";

    public static final String FUNC_INCREASEOBSERVATIONCARDINALITYNEXT = "increaseObservationCardinalityNext";

    public static final String FUNC_INITIALIZE = "initialize";

    public static final String FUNC_MINT = "mint";

    public static final String FUNC_SWAP = "swap";

    @Deprecated
    protected IUniswapV3PoolActions(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected IUniswapV3PoolActions(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    @Deprecated
    protected IUniswapV3PoolActions(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    protected IUniswapV3PoolActions(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteFunctionCall<TransactionReceipt> burn(BigInteger tickLower, BigInteger tickUpper, BigInteger amount) {
        final Function function = new Function(
                FUNC_BURN, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Int24(tickLower), 
                new org.web3j.abi.datatypes.generated.Int24(tickUpper), 
                new org.web3j.abi.datatypes.generated.Uint128(amount)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> collect(String recipient, BigInteger tickLower, BigInteger tickUpper, BigInteger amount0Requested, BigInteger amount1Requested) {
        final Function function = new Function(
                FUNC_COLLECT, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, recipient), 
                new org.web3j.abi.datatypes.generated.Int24(tickLower), 
                new org.web3j.abi.datatypes.generated.Int24(tickUpper), 
                new org.web3j.abi.datatypes.generated.Uint128(amount0Requested), 
                new org.web3j.abi.datatypes.generated.Uint128(amount1Requested)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> flash(String recipient, BigInteger amount0, BigInteger amount1, byte[] data) {
        final Function function = new Function(
                FUNC_FLASH, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, recipient), 
                new org.web3j.abi.datatypes.generated.Uint256(amount0), 
                new org.web3j.abi.datatypes.generated.Uint256(amount1), 
                new org.web3j.abi.datatypes.DynamicBytes(data)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> increaseObservationCardinalityNext(BigInteger observationCardinalityNext) {
        final Function function = new Function(
                FUNC_INCREASEOBSERVATIONCARDINALITYNEXT, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint16(observationCardinalityNext)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> initialize(BigInteger sqrtPriceX96) {
        final Function function = new Function(
                FUNC_INITIALIZE, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint160(sqrtPriceX96)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> mint(String recipient, BigInteger tickLower, BigInteger tickUpper, BigInteger amount, byte[] data) {
        final Function function = new Function(
                FUNC_MINT, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, recipient), 
                new org.web3j.abi.datatypes.generated.Int24(tickLower), 
                new org.web3j.abi.datatypes.generated.Int24(tickUpper), 
                new org.web3j.abi.datatypes.generated.Uint128(amount), 
                new org.web3j.abi.datatypes.DynamicBytes(data)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> swap(String recipient, Boolean zeroForOne, BigInteger amountSpecified, BigInteger sqrtPriceLimitX96, byte[] data) {
        final Function function = new Function(
                FUNC_SWAP, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, recipient), 
                new org.web3j.abi.datatypes.Bool(zeroForOne), 
                new org.web3j.abi.datatypes.generated.Int256(amountSpecified), 
                new org.web3j.abi.datatypes.generated.Uint160(sqrtPriceLimitX96), 
                new org.web3j.abi.datatypes.DynamicBytes(data)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    @Deprecated
    public static IUniswapV3PoolActions load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new IUniswapV3PoolActions(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    @Deprecated
    public static IUniswapV3PoolActions load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new IUniswapV3PoolActions(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static IUniswapV3PoolActions load(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return new IUniswapV3PoolActions(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static IUniswapV3PoolActions load(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return new IUniswapV3PoolActions(contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<IUniswapV3PoolActions> deploy(Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(IUniswapV3PoolActions.class, web3j, credentials, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<IUniswapV3PoolActions> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(IUniswapV3PoolActions.class, web3j, credentials, gasPrice, gasLimit, BINARY, "");
    }

    public static RemoteCall<IUniswapV3PoolActions> deploy(Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(IUniswapV3PoolActions.class, web3j, transactionManager, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<IUniswapV3PoolActions> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(IUniswapV3PoolActions.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, "");
    }
}
